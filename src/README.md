# Online Farmers Market Platform

The Online Farmers Market Platform is a digital solution designed to bridge the gap between local farmers and consumers, fostering efficient and sustainable purchasing of fresh produce. This project promotes local food networks and ensures a seamless process of buying and selling local products.

---

## **Features**

### Core Features (Review 3)
1. **Farmer Registration**:
   - Farmers can register their information, including name, produce, and price per kilogram.
   - Validations are applied to ensure the accuracy of input data.
2. **Produce Listing**:
   - Displays a list of available produce with associated farmer details.
   - Dynamically generated views using Servlets and JSP.
3. **Interactive GUI**:
   - Java Swing-based user interface for ease of interaction.
   - Event handling implemented for UI components.
4. **Servlet and JSP Integration**:
   - `doGet` and `doPost` methods for handling HTTP requests.
   - JSP used for data rendering and user-friendly design.

### Finalized Features (Review 4)
1. **Error Handling and Validation**:
   - Comprehensive error handling on both client and server sides.
   - Real-time feedback for input errors.
2. **Testing**:
   - Unit and integration tests ensure core functionality works as intended.
   - Edge cases considered during testing.
3. **Configuration Management**:
   - Centralized configuration using `config.properties` for flexibility.
4. **Responsive Design**:
   - The UI is accessible across various screen sizes and devices.
5. **Documentation**:
   - Complete documentation for project setup and usage.

---

## **Technologies Used**

1. **Frontend**:
   - Java Swing for GUI
   - HTML, CSS, and Bootstrap for optional web components
2. **Backend**:
   - Java Servlets and JSP
   - JDBC for database connectivity
3. **Testing**:
   - JUnit for automated tests
4. **Configuration**:
   - `config.properties` for centralized settings

---

## **Folder Structure**

```plaintext
OnlineFarmersMarket/
│
├── java/
│   ├── models/
│   │   ├── Farmer.java
│   │   ├── ConfigLoader.java
│   │   └── DatabaseConnection.java
│   ├── servlets/
│   │   ├── FarmerServlet.java
│   │   └── ProduceServlet.java
│   ├── gui/
│   │   ├── MainFrame.java
│   │   ├── RegisterUser.java
│   │   └── FarmersList.java
│
├── resources/
│   ├── config.properties
│   ├── messages.properties
│
├── webapp/
│   ├── index.jsp
│   ├── farmer.jsp
│   ├── produce.jsp
│   └── error.jsp
│
├── tests/
│   ├── FarmerTest.java
│   ├── ConfigLoaderTest.java
│   └── DatabaseConnectionTest.java
│
└── README.md
