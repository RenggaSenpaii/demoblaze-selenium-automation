# demoblaze-selenium-automation
UAS Praktikum Pengujian Perangkat Lunak
# Demoblaze Selenium Automation Testing

Automation testing untuk aplikasi e-commerce **Demoblaze** menggunakan **Selenium WebDriver** dengan pendekatan **Page Object Model (POM)**.  
Project ini merupakan bagian dari tugas **UAS Praktikum PPL** dan disesuaikan dengan hasil **manual testing** yang telah dilakukan sebelumnya.

---

## 📌 Application Under Test
- **Name**: Demoblaze
- **URL**: https://www.demoblaze.com
- **Type**: Web-based E-Commerce Application

---

## 🛠 Tools & Technologies
- Java JDK 11+
- Selenium WebDriver
- TestNG
- Maven
- Google Chrome
- ChromeDriver

---

## 🧩 Automation Framework
- **Design Pattern**: Page Object Model (POM)
- **Testing Approach**: Smoke Testing & Happy Path Automation

Automation difokuskan pada fitur-fitur kritikal aplikasi, bukan seluruh skenario manual testing.

---

## ✅ Automated Test Cases
| Test Case ID | Test Scenario |
|-------------|---------------|
| TC_LOGIN_001 | Login dengan data valid |
| TC_CART_001 | Menambahkan produk ke dalam cart |

> Catatan: Bug validasi input pada proses checkout diuji melalui **manual testing**, bukan automation.

---

## 📁 Project Structure
demoblaze-selenium-automation
│
├── src/test/java
│ └── com/renggauas/testing/automation
│ ├── pages
│ │ ├── BasePage.java
│ │ ├── LoginPage.java
│ │ ├── HomePage.java
│ │ └── CartPage.java
│ │
│ └── tests
│ ├── BaseTest.java
│ ├── LoginTest.java
│ └── AddToCartTest.java
│
├── pom.xml
└── README.md


---

## ▶️ How to Run the Tests
1. Clone repository ini
2. Buka project menggunakan IntelliJ IDEA / VS Code
3. Pastikan Chrome & ChromeDriver sudah terinstall
4. Jalankan test:
   - Klik kanan `LoginTest.java` → Run
   - Klik kanan `AddToCartTest.java` → Run

---

## 📊 Test Result
- Seluruh automation test case **berhasil dijalankan (PASSED)**
- Automation berjalan stabil dengan pendekatan explicit wait

---

## 📎 Notes
- Automation testing difokuskan pada skenario positif (happy path)
- Manual testing digunakan untuk validasi negative case dan bug detection
- Website Demoblaze merupakan website demo sehingga performa dan stabilitas dapat bervariasi

---

## 👨‍💻 Author
- **Name**: Rengga
- **Course**: Praktikum Pengujian Perangkat Lunak (PPPL)
- **Type**: UAS Project

---
