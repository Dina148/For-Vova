Feature:  espo home page

  Scenario: navigate to espo home page


    Given the user navigate the "https://demo.espocrm.com/"

    When the user opens the home page
    Then the user should see the titles

      | Home |
      | Accounts |
      | Contacts |
      | Leads |
      | Opportunities |
      | Reports |
      | Quotes |
      | Sales Orders |
      | Invoices |
      | Products |
      | Emails |
      | Cases |
      | Calender |
      | Tasks |


# Here 14 row, but on web we have 15
