[![](https://jitpack.io/v/ashishpujari204/CustomToast.svg)](https://jitpack.io/#ashishpujari204/CustomToast)

# Project Title 

CustomToast : Custom Toast is simple tosat message library.

# Prerequisites

Add this in your root build.gradle file

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 ```
# Dependency

Add this to your app level build.gradle file

```
dependencies {
	        implementation 'com.github.ashishpujari204:CustomToast:Tag'
	}
  ```
  
 #Usage
 
 To display an default Toast:
 ```
 CustomToastClass.showDefaultToast(this@MainActivity,"Default Toast", ResourcesCompat.getFont(this@MainActivity, R.font.google_sans_regular))
 ```
 
 To display an Success Toast:
 ```
 CustomToastClass.showSuccessToast(this@MainActivity,"Success Toast", ResourcesCompat.getFont(this@MainActivity, R.font.google_sans_regular))
 ```
 
 To display an Info Toast:
 ```
 CustomToastClass.showInfoToast(this@MainActivity,"Info Toast", ResourcesCompat.getFont(this@MainActivity, R.font.google_sans_regular))
 ```
 
 To display an Warning Toast:
 ```
 CustomToastClass.showWarningToast(this@MainActivity,"Warning Toast", ResourcesCompat.getFont(this@MainActivity, R.font.google_sans_regular))
 ```
 
 To display an Error Toast:
 ```
 CustomToastClass.showErrorToast(this@MainActivity,"Error Toast", ResourcesCompat.getFont(this@MainActivity, R.font.google_sans_regular))
 ```
