Page Title: VMOCK | GiveFeedbackPage

#Object Definitions
====================================================================================
buttonGiveFeedback			xpath			//div[@class="intro-footer-btn"]/button[@class="btn btn-primary"]
letStart					css				button[aria-label="Click to start giving your feedback"]
bulletByBullet				css				a[data-name="bullet"]
clickOnBullet				xpath			//span[@class="ff1"][contains(text(),"${options}")]
superThumb					css				span[class="bullet-feedback icon-super-thumbs-up"]
singleThumb					css				span[class="bullet-feedback icon-thumbs-up"]
downThumb					css				span[class="bullet-feedback icon-thumbs-down"]
giveFeedback				xpath			//div[@class="bullet-feedback-message"]/textarea[@placeholder="Type the feedback"]
standardResponse			xpath			//span[text()="Select a Standard Response"]
standardOptions				xpath			//span[text()="${options}"]
finishNote					xpath			//button[@class="btn bullet-feedback-finish"][text()="Finish"]
editIcon					css				span[class="bullet-icon icon-edit"]
deleteIcon					css				span[class="bullet-feedback icon-dust-bin"]
yesDelete					xpath			//button[@class="btn btn-xs"][text()="Yes"]
addNote						css				a[id="add-note-on-footer"]
titleFeedback				css				input[placeholder="Type the title"]
typeFeedback				css				textarea[placeholder="Type the feedback"]
finishBtnNode				xpath			//div[@class="pull-right"]/button[@type="submit"][@class="btn btn-primary"]
viewAll						xpath			//a[@data-name="view_all"]
editNote					xpath			//span[@class='icon-edit']
deleteNote					xpath			//span[@class='icon-dust-bin']
viewAddedNote				xpath			//button[@aria-label="Click to view notes."]
addNewNote					xpath			//button[@aria-label="Click to add new note."]
goBack						xpath			//div[@class="view-all-text"][text()="go back"]
noNoteAdded					xpath			//div[text()="No notes added yet."]	
addNoteBtn					xpath			//a[@aria-label="add new notes"]
submitFeedback				xpath			//a[contains(text(),'Submit')]
resumePresentationStar		xpath			//*[@id="app"]/div/div/div[1]/div[2]/div[3]/div/div/div/div/div/div[3]/div[1]/div/div[2]/div/a[1]
resumeImpactStar			xpath			//*[@id="app"]/div/div/div[1]/div[2]/div[3]/div/div/div/div/div/div[3]/div[2]/div/div[2]/div/a[2]
competenciesStar			xpath			//*[@id="app"]/div/div/div[1]/div[2]/div[3]/div/div/div/div/div/div[3]/div[3]/div/div[2]/div/a[3]
jobRoleStar					xpath			//*[@id="app"]/div/div/div[1]/div[2]/div[3]/div/div/div/div/div/div[3]/div[4]/div/div[2]/div/a[4]
typeSubmitFeedback			xpath			//*[@id="app"]/div/div/div[1]/div[2]/div[3]/div/div/div/div/div/div[4]/div[2]/textarea
finishLastBtn				xpath			//*[@id="app"]/div/div/div[1]/div[2]/div[3]/div/div/div/div/div/div[5]/div/div[2]/div/button
verifyThanks				xpath			//div[text()="Thanks a lot!"]
			