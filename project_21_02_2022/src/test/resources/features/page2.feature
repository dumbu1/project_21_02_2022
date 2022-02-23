Feature: feature2
Background: navigation to Page2
Given user is in "Web Examples - CrossBrowserTesting.com" page
When user clicks on selenium Example page


Scenario: feature2_sceanrio1
Given user is in "Selenium Test Example Page"
When user enters "sheereesh" on Input Text Here textbox
Then system should display "sheereesh" in Input Text Here textbox


Scenario: feature2_sceanrio2
Given user is in "Selenium Test Example Page"
When user enters data in the form
And user clicks on submit button
