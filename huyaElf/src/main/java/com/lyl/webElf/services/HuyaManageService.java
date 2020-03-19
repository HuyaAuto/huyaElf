package com.lyl.webElf.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lyl.webElf.base.context.ChromeDriverContext;
import com.lyl.webElf.base.context.DriverContext;
import com.lyl.webElf.consts.PageNameConsts;
import com.lyl.webElf.domain.GuessItem;
import com.lyl.webElf.domain.LiveItem;
import com.lyl.webElf.utils.ChromeDriverCreater;
import com.lyl.webElf.utils.ChromeHeadLessDriverCreater;
import com.lyl.webElf.utils.DriverUtil;
import com.lyl.webElf.utils.PhantomjsDriverCreater;
@Scope("prototype")
@Service
public class HuyaManageService {
	@Autowired
	private LivePageService livePageService;
	@Autowired
	private HostPageService hostPageService;
	@Autowired
	private LoginWindowService loginWindowService;
	@Autowired
	private TestService testService;
	
	private List<LiveItem> allLiveItemList = new ArrayList<LiveItem>();
	private LiveItemDao liveItemDao;
	
	public LivePageService getLivePageService() {
		return livePageService;
	}

	public void setLivePageService(LivePageService livePageService) {
		this.livePageService = livePageService;
	}
	
	public HostPageService getHostPageService() {
		return hostPageService;
	}

	public void setHostPageService(HostPageService hostPageService) {
		this.hostPageService = hostPageService;
	}

	public LoginWindowService getLoginWindowService() {
		return loginWindowService;
	}

	public void setLoginWindowService(LoginWindowService loginWindowService) {
		this.loginWindowService = loginWindowService;
	}

	public void getGuessList(int pageNum) throws Exception {
		while(true){
			for(int i = 0;i<pageNum;i++){
				boolean isFirstPage;
				if(i == 0){
					DriverUtil.open("https://www.huya.com/l");
					isFirstPage= true;
				}else{
					checkPrePages(i);
					isFirstPage = false;
					livePageService.nextPage();
				}
				livePageService.initLivePage(false, isFirstPage);
				Thread.sleep(2222);
				List<LiveItem>  liveItemListCurPage = livePageService.getLiveItemList();
				

				for (int k = 0; k < liveItemListCurPage.size(); k++) {
					LiveItem liveItem =  liveItemListCurPage.get(k);
					WebElement link = liveItem.getLink();
					link.click();
					DriverUtil.switchToNewWindow();

					System.out.println(DriverUtil.getDefaultDriver().getCurrentUrl());
					System.out.println(k);
					// hanles.put(PageNameConsts.HOST_PAGE,
					// driver.getWindowHandle());
					if (hostPageService.hasGuess()) {
						liveItem.setGuess(true);
					}
					DriverUtil.getDefaultDriver().close();
					DriverUtil.getDefaultDriver().switchTo().window(DriverUtil.getDefaultHandles().get(PageNameConsts.LIVE_PAGE));
				}
				allLiveItemList.addAll(liveItemListCurPage);
				liveItemDao.insertList(liveItemListCurPage);
				
			}
		}
	}

	private void checkPrePages(int curPageNum) {
		for(int i = 0;i<curPageNum;i++){
			boolean isFirstPage;
			if(i == 0){
				DriverUtil.open("https://www.huya.com/l");
				isFirstPage= true;
			}else{
				isFirstPage = false;
				livePageService.nextPage();
			}
			livePageService.initLivePage(false, isFirstPage);
			Thread.sleep(2222);
			List<LiveItem>  liveItemListCurPage = livePageService.getLiveItemList();

			for (int k = 0; k < liveItemListCurPage.size(); k++) {
				LiveItem liveItem =  liveItemListCurPage.get(k);
				if(!allLiveItemList.contains(liveItem)){

					WebElement link = liveItem.getLink();
					link.click();
					DriverUtil.switchToNewWindow();

					System.out.println(DriverUtil.getDefaultDriver().getCurrentUrl());
					System.out.println(k);
					// hanles.put(PageNameConsts.HOST_PAGE,
					// driver.getWindowHandle());
					if (hostPageService.hasGuess()) {
						liveItem.setGuess(true);
					}
					DriverUtil.getDefaultDriver().close();
					DriverUtil.getDefaultDriver().switchTo().window(DriverUtil.getDefaultHandles().get(PageNameConsts.LIVE_PAGE));
					allLiveItemList.add(liveItem);
					liveItemDao.insert(liveItem);
				}
			}
			
		}
		
	}

	public void guess(List<String> hostUrls,DriverContext driverContext) throws Exception {
		//DriverUtil.open(hostUrl);

		//hostPageService.openLoginWindow();
		//loginWindowService.loginByAccount("2295451338","huya123");
		//hostPageService.guess(hostUrls,driverContext);
		testService.guess(hostUrls,driverContext);
	}
	
}
