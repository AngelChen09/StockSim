# Project Changelog

## Unreleased

### New Features

- Added `ViewHistory` use case to view transaction history
- Added GUI components for view transaction history page
- Implemented login use case
- Implemented periodic update of stock information from data access interface in `StockMarket` that self-adjust based on API rate limit

### Internal Changes

- Implemented `ClientSessionManager` for client-side session management.
- Implemented credential verification in `BuyStockController`.
- Moved `ValidationException` into a separate class in utility.
- Implemented `StockDataAccess` to retrieve current market price for set tickers
- Modified `StockMarket` to utilize new IStockDataAccess return type
- Updated maven configuration with api request dependencies
- Added config resource file for 30 preset ticker names
- Modified `InMemoryStockDataAccessObject` to utilize new IStockDataAccess return type
- Added new api calls in `StockDataAccess` to retrieve and store company name and industry
- Modified `Stock`, `StockMarket`, and `InMemoryStockDataAccessObject` to store and utilize new company and industry data
- Modified `InMemoryUserDataAccessObject` to utilize `ViewHistoryDataAccessInterface` as well
- Implemented filter filed in market search panel
- Changed password input field using `JPasswordField`
- Added `getAssets` method in user entity
- Reformated app builder to accept more configs
- Implemented singleton pattern for service manager
- Added test cases for `ViewHistoryInteractor` with mock buy and sell transactions.

### Bug Fixes

## 0.1.0

### New Features

- Added `SessionManager` to validate client request by credential and manage active sessions
- Added GUI components for trading page

### Internal Changes

- Created documentation for GitHub workflow and pull request template
- Added maven workspace and configuration
- Added Use Cases 4 and 5
- Implemented entities for stock and stock market
- Implemented entities for user, portfolio, and transaction
- Added synchronization checks and null checks in `StockMarket`
- Modified `Portfolio` constructor to match the optional return value of `StockMarket.getStock`
- Modified `Portfolio` constructor to take `Map<String, UserStock>` as parameter and remove synchronization with `StockMarket` data
- Updated `UserStock`: Rename `PurchasePrice` to `cost`
- Implemented controller and presenter for execute buy use case
- Implemented framework for view component update
- Added GUI components for trading page
- Implemented buy use case interactor and set up unit tests
- Removed outdated classes and methods that are incompatible with current codebase version
- Updated maven configuration with unit test and api request dependencies
- Implemented the frontend framework

### Bug Fixes
