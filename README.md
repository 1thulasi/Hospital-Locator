Hospital Locator App

📌 Overview
The Hospital Locator App is an Android application built using Kotlin, XML, and Google Maps API. It helps users quickly find nearby hospitals, view their details, and get directions.

Users first allow the app to access their location via GPS, and then the app filters and displays nearby hospitals with all essential information.

🚀 Features

✔️ Fetch user’s current location using GPS

✔️ Display nearby hospitals on Google Maps

✔️ Show hospital details (Name, Address, Contact Info)

✔️ Search hospitals by name or location

✔️ Get real-time navigation to hospitals

✔️ Simple and user-friendly UI

✔️ Works offline with locally stored hospital data (SQLite/XML/JSON)

🛠️ Tech Stack

Programming Language: Kotlin

UI Design: XML (Android Layouts)

Maps & Location Services: Google Maps API, GPS

IDE: Android Studio


🎯 How It Works

1️⃣ User opens the app and grants location permission
2️⃣ The app fetches the user’s current GPS location
3️⃣ Nearby hospitals (from local data) are filtered based on distance
4️⃣ Hospitals are displayed as markers on Google Maps
5️⃣ User taps a marker to view details (name, address, contact info)
6️⃣ User can choose navigation to the hospital using Google Maps

📌 Cloning & Running the Project
1️⃣ Clone the Repository
git clone https://github.com/YourUsername/Hospital-Locator-App.git
cd Hospital-Locator-App

2️⃣ Open in Android Studio

Open Android Studio → Open an existing project

Select the Hospital-Locator-App folder

3️⃣ Add Google Maps API Key

Go to Google Cloud Console
 → Create API key for Maps SDK

Add the API key in AndroidManifest.xml:

<meta-data
    android:name="com.google.android.geo.API_KEY"
    android:value="YOUR_API_KEY_HERE"/>
