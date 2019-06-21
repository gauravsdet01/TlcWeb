Page Title: VMOCK | SettingsPage

#Object Definitions
====================================================================================
settingsIcon			css				a[class="user-info"]
editName				css				a[aria-label="Edit name"]
firstName				css				input[id="first_name"]
lastName				css				input[id="last_name"]
optionButton			xpath		    //button[text()="${options}"]
changedSuccessfully		xpath			//span[@class="noty_text"][text()="${text}"]
changePassword			css				a[data-element="password"]
oldPassword				css				input[id="password_old"]
newPassword				css				input[id="password_new"]
confirmPassword			css				input[id="password_confirm"]
goBack					xpath			//button[text()="go back"]
logoutButton			css				button[class="btn btn-danger"]
loginSuccess			xpath			//div[@class="card-title"]/span[text()="${option}"]
devicesLoggedIn			xpath			//span[text()="This is where you're logged in right now."]
