[![](https://jitpack.io/v/ashishpujari204/CustomToast.svg)](https://jitpack.io/#ashishpujari204/CustomToast)
[![](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![](https://img.shields.io/badge/Support-Linkedin-brightgreen)](https://in.linkedin.com/in/ashish-pujari-b2655166)
# Project Title 

CustomToast : Custom Toast is a simple toast message library.

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

Add this to your app-level build.gradle file

```
dependencies {
	        implementation 'com.github.ashishpujari204:CustomToast:1.1'
	}
  ```
  
 # Usage
  
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
 
# Screenshots

Please check below screen shots.
![Alt text](https://github.com/ashishpujari204/CustomToast/blob/staging/default.jpg "Default Toast")
![Alt text](https://github.com/ashishpujari204/CustomToast/blob/staging/success.jpg "Success Toast")
![Alt text](https://github.com/ashishpujari204/CustomToast/blob/staging/info.jpg "Info Toast")
![Alt text](https://github.com/ashishpujari204/CustomToast/blob/staging/warning.jpg "Warning Toast")
![Alt text](https://github.com/ashishpujari204/CustomToast/blob/staging/error.jpg "Error Toast")


# Contributing

Please fork this repository and contribute back using (https://github.com/ashishpujari204/CustomToast) 

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated but will be thoroughly reviewed .

# Licenses

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright [2020] [Ashish Pujari]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
