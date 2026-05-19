# BDD Cucumber Selenium Framework

Behavior-Driven Development (BDD) test framework using Cucumber, Selenium WebDriver, and Gherkin — enabling non-technical stakeholders to read and write test scenarios in plain English.

## Tech Stack
| Tool | Purpose |
|------|---------|
| Java | Core language |
| Selenium WebDriver | Browser automation |
| Cucumber | BDD test runner |
| Gherkin | Human-readable test syntax |
| TestNG | Underlying runner integration |
| Maven | Build & dependency management |

## Project Structure
```
src/
├── main/java/com/bit/
│   ├── browser/BaseTest.java       # WebDriver setup/teardown
│   ├── browser/LandingPage.java    # Login page object
│   ├── browser/ProfilePage.java    # Post-login page object
│   └── utils/Util.java             # Shared utilities
└── test/java/
    ├── Runner.java                 # Cucumber test runner
    └── StepDefination.java         # Step definition implementations
features/
├── mylogin.feature                 # Login scenarios (valid/invalid)
├── parameter.feature               # Parameterized scenarios
└── driven.feature                  # Data-driven scenarios
```

## Sample Feature (Gherkin)
```gherkin
Feature: Login
  Scenario: Valid login
    Given open browser
    And navigate to the site
    When I enter valid username and password
    And I click login
    Then I should be on the dashboard

  @smoke
  Scenario: Invalid login
    When I enter invalid credentials
    Then I should see an error message
```

## Running Tests
```bash
mvn clean test
```

## Skills Demonstrated
- BDD with Cucumber and Gherkin syntax
- Page Object Model inside a BDD framework
- Smoke-tagged test filtering (`@smoke`)
- Separation of feature files from step definitions
