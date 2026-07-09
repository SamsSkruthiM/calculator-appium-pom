
# 📱 Calculator App Automation using Appium

This is a small automation project I built to test the native **Google Calculator** app on an Android Emulator using **Appium**. I wrote it in **Java** and followed the **Page Object Model (POM)** pattern so the code stays clean and doesn't turn into a mess as it grows.

The framework covers basic arithmetic — addition, subtraction, multiplication, and division — and checks that the results shown on screen actually match what's expected, using TestNG assertions.

---

## 🚀 Tech Stack

- Java 17
- Appium
- Selenium
- TestNG
- Maven
- Android Studio Emulator
- IntelliJ IDEA

---

## 📂 Project Structure

```
calculator-appiumpom
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── base
│   │   │   ├── pages
│   │   │   └── utils
│   │   └── resources
│   │
│   └── test
│       └── java
│           └── tests
│
├── testng.xml
├── pom.xml
└── README.md
```

---

## 📌 What It Does

- Automates the Google Calculator app end to end
- Follows the Page Object Model, so locators and test logic stay separate
- Runs on an Android Emulator
- Test cases are written in TestNG
- Uses Maven for managing dependencies
- Simple enough to read through and extend on your own

---

## 🧪 Test Cases

Right now it covers:

- ✔ Addition
- ✔ Subtraction
- ✔ Multiplication
- ✔ Division

Each test runs the operation and asserts that the result matches what the calculator actually shows.

---

## ⚙ Before You Start

Make sure you've got these installed:

- Java JDK 17
- Android Studio
- Android Emulator
- Appium Server
- Maven
- IntelliJ IDEA

---

## ▶️ How to Run It

**1. Clone the repo**
```bash
git clone https://github.com/yourusername/calculator-appiumpom.git
```

**2. Start the Appium server**
```bash
appium
```

**3. Fire up the Android Emulator**
Launch it from Android Studio like you normally would.

**4. Double-check the emulator is connected**
```bash
adb devices
```
You should see something like:
```
emulator-5554    device
```

**5. Run the tests**
Either run `CalculatorTest.java` directly from IntelliJ, or from the terminal:
```bash
mvn clean test
```

---

## ✅ Sample Output

```
Default Suite
Total tests run: 4
Passes: 4
Failures: 0
Skips: 0
BUILD SUCCESS
```

---

## 📖 How It's Organized

The project is split into three main pieces:

- **BaseTest** – handles setting up and tearing down the driver
- **CalculatorPage** – holds all the calculator's locators and reusable actions
- **CalculatorTest** – where the actual test cases and assertions live

Keeping these separate makes it much easier to maintain and reuse as the project grows.

---

## 📸 Screenshots

*(Feel free to add screenshots here — emulator setup, the app in action, test runs, TestNG results, etc.)*

---

## 🔮 What I'd Like to Add Next

This is still a work in progress, and there's a lot I want to build on:

- Extent Reports for nicer test summaries
- Auto screenshot capture on failure
- Jenkins CI/CD pipeline
- GitHub Actions integration
- Data-driven testing
- Better logging with Log4j

---

## 👩‍💻 About Me

**Samskruthi M**
Information Science and Engineering student, passionate about software testing, mobile automation, and Java development. Always looking to learn and build more.


