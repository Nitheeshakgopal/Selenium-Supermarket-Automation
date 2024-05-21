package com.supermartket.test;

import org.testng.annotations.Test;

public class ManageUser extends BaseTest{
@Test

	public void verifyManageUsersPage() throws Exception {
		lp.login();
		hp.navigateToManageUsersPage();
		mu.manageUserPage();
	}
	
	
}
