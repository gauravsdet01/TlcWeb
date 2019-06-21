Page Title: VMOCK | ResumeUploadPage

#Object Definitions
====================================================================================
skipIntro1						css			#dashboard-intro-carousel > div > div > div > div.slick-slide.slick-active.slide-left > div.dashboard-intro-footer > button
skipIntro2                      css         #dashboard-intro-carousel > div > div > div > div.slick-slide.slick-active.slide-left > div.dashboard-intro-footer > button
skipIntro3                      xpath       //*[@id="dashboard-intro-carousel"]/div/div/div/div[3]/div[2]/button
resumeUploadButton				xpath		//span[contains(text(),"Upload")]
uploadNewResume					css			img[src="/dist/img/upload-new-resume.png"]
resumeUploadedSuccessfully		xpath		//span[@class="noty_text"][text()="${text}"]
viewFeedback					xpath		//a[text()="View Detailed Feedback"]
seeDetailedFeedback				xpath		//a[@aria-label="View Detailed Feedback"][text()="View Detailed Feedback"]
closeWalk                       css         body > div.enjoyhint.enjoyhint-step-1 > div.enjoyhint_close_btn
verifyImpactHeader				xpath		//div[@class="infobox-heading text-uppercase h5-div"][text()="${options}"]
imapctOptions					xpath 		//a[contains(text(),"${options}")]
seeGuidance						xpath		//button[@class="btn btn-outline-primary js-sf-button"][text()="see guidance"]					
modalHeader						xpath		//strong[text()="${options}"]
modalSubHeader					xpath		//div[@class="hr-text"][text()="${options}"]
exampleHeader					xpath		//a[@aria-label="EXAMPLES"][text()="EXAMPLES"]
closeButton						css			button[class="close-btn"][aria-label="click to close guidance."]
presentationPage				xpath		//a[contains(text(),"Presentation")]
competenciesPage				xpath 		//a[contains(text(),"Competencies")]
summaryPage						xpath		//a[contains(text(),"Summary")]
bulletLevelFeedbackPage			xpath		//a[contains(text(),"Bullet Level Feedback")]
skipBulletFTUE					css			div[class="enjoyhint_close_btn"]	
showBulletpage					xpath		//div[@class="bullet-feedback-filters-heading"][text()="Show Bullets"]
markedYellow					css			div[class="bullet-feedback-filter bullet-feedback-filter-warning "]
markedRed						css			div[class="bullet-feedback-filter bullet-feedback-filter-danger "]
textContains					xpath		//div[@class="bullet-feedback-viewer-checks-title"][text()="${option}"]
scoreCalculation				xpath		//a[text()="See how it is calculated"]
scoreBased						xpath		//div[text()="Your score is based on 3 core modules"]
closeScoreCalculation			css			button[class="close-btn"][tabindex="30"]
toggleButton					css			div[class="slider round"]
verifyToggleOff					xpath       //label[@class="presentation-toggle-text"][contains(text(),"Toggle")]
addToDictionary					xpath 		//a[text()="+ Add to Dictionary"]
dictionaryHeader				xpath		//h4[text()="Add to Dictionary"]
addGrofersDictionary			xpath		//span[text()="grofers"]
addDictionary					xpath		//button[text()="Add to Dictionary"]
addedDictionary					xpath		//h4[text()="Previously Added Words"]
reuploadResume					xpath		//a[text()="Reupload Resume"][@data-radium="true"]
verifyResumeUploading			css			a[aria-label="VMock logo - Student dashboard"]
elementNotPresent				xpath		//span[@class="badge badge-keyword"][contains(text(),"Grofers")]
skipFeedbackCompetenciesIntro	xpath		//button[@tabindex="40"]/span[@class="modal-close-icon icon-cross"]

