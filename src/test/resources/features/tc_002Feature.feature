Feature: Validate file upload with valid format and preview

  Scenario: Upload a file in PDF/DOCX format within the 50 MB limit
    Given the user navigates to the file upload page
    When the user selects a valid PDF/DOCX file within the size limit
    Then the file is uploaded successfully
    And the file preview is displayed with the correct name, size, and type