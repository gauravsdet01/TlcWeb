Page Title: VMOCK | NetworkFeedbackVerificationPage

#Object Definitions
====================================================================================
badgeCounter				xpath			//span[@class="nf-unread-badge"][text()="1"]
verifyFeedbackMessage		xpath			//div[@class="message"][text()="Good Overall"]
viewFeedback				xpath			//a[text()="view feedback"]
verifyNote					xpath			//div[text()="Feedback Given"]
dashboardPage				css				a[href="/dashboard/resume"]
verifyOnDashboardPage		xpath			//div[@class="card-title"]/span[text()="RE"]
skipCareerIntro				css				button[class=" dashboard-intro-close dashboard-cf-intro-close"]
networkFeedbackPage			css				div[aria-label="Network Feedback Product"]