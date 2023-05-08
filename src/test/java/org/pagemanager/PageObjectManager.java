package org.pagemanager;

import org.pages.AssetCondition;
import org.pages.AssetPage;
import org.pages.CategoryPage;
import org.pages.DepartmentPage;
import org.pages.LocationPage;
import org.pages.LoginPage;
import org.pages.ParentChildAssetPage;
import org.pages.TransferMaster;



public class PageObjectManager {
	
	
	private LoginPage loginPage;
	private CategoryPage categoryPage;
	private AssetPage assetPage;
	private AssetCondition assetCondition;
	private ParentChildAssetPage parentChildAssetPage;
	private DepartmentPage departmentPage;
	private LocationPage locationPage;
    private TransferMaster transferMaster;


	public LoginPage getLoginPage() {
		return (loginPage==null)?loginPage=new LoginPage():loginPage;
		
	}


	public CategoryPage getCategoryPage() {
		return (categoryPage==null)?categoryPage=new CategoryPage():categoryPage;
	}

	
	public AssetPage getAssetPage() {
		return (assetPage==null)?assetPage= new AssetPage():assetPage;
	}


	public AssetCondition getAssetCondition() {
		return (assetCondition==null)?assetCondition= new AssetCondition():assetCondition;
	}

	

	public ParentChildAssetPage getParentChildAssetPage() {
		return (parentChildAssetPage==null)?parentChildAssetPage = new ParentChildAssetPage():parentChildAssetPage;
	}


	public DepartmentPage getDepartmentPage() {
		return (departmentPage==null)?departmentPage= new DepartmentPage():departmentPage;
	}
	
	
	public LocationPage getLocationPage() {
		return (locationPage==null)?locationPage=new LocationPage():locationPage;
		
	}


	public TransferMaster getTransferMaster() {
		return (transferMaster==null)?transferMaster=new TransferMaster():transferMaster;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
