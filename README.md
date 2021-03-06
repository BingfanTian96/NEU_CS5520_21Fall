# NEU_CS5520_21Fall

### Welcome!

This is the repository I prepared for **CS5520** - Mobile Application Development - 2021 fall. You will see all the code I built for this course here. And I will also summarize the content learned in each lesson.

# Lessons

Here is the lessions that I took during this semester.

## Lesson 2_3 Implicit intents
Here is the [Link](https://github.com/BingfanTian96/NEU_CS5520_21Fall/tree/main/lesson2_3) to my code. 

### Output:
<p float="left">
    <img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/2_3_1.png" width="300" />
    <img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/2_3_2.png" width="300" />
</p>
<p float="left">
    <img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/2_3_3.png" width="300" />
    <img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/2_3_4.png" width="300" />
</p>
<p float="left">
    <img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/2_3_5.png" width="300" />
    <img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/2_3_6.png" width="300" />
</p>

The main purpose of this lesson is to learn the Implicit intents.

- An implicit  `Intent`  allows you to activate an  `Activity`  if you know the action, but not the specific app or  `Activity`  that will handle that action.
- The Android system matches the content of an implicit  `Intent`  and the  `Intent`  filters of any available  `Activity`  to determine which  `Activity`  to activate. If there is more than one available  `Activity`, the system provides a chooser so the user can pick one.
### Homework: (optional, will finish in future)
- **Build and run an app**

- **Question 1**: Which constructor method do you use to create an implicit `Intent` to launch a camera app?
	
- **Question 2**: When you create an implicit `Intent` object, which of the following is true?
	
- **Question 3**: Which `Intent` action do you use to take a picture with a camera app?

## Lesson 2_2 Activity lifecycle and state
Here is the [Link](https://github.com/BingfanTian96/NEU_CS5520_21Fall/tree/main/lesson2_1) to my code. I finish this lesson base on the code from lesson 2_1, so the code of lesson 2_1 was been overwritten.

### Output:
<p float="left">
    <img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/2_2_1.png" width="600" />
</p>

The main purpose of this lesson is to learn the activity lifecycle.

- Each state in the  `Activity`  lifecycle has a corresponding callback method.
- The lifecycle methods are  `onCreate()`,  `onStart()`,  `onPause()`,  `onRestart()`,  `onResume()`,  `onStop()`,  `onDestroy()`.
- Device configuration changes such as rotation results in the  `Activity`  being destroyed and recreated as if it were new.
-   Save  `Activity`  instance state in the  `onSaveInstanceState()`  method.
-   Instance state data is stored as simple key/value pairs in a  `Bundle`. Use the  `Bundle`  methods to put data into and get data back out of the  `Bundle`.
-   Restore the instance state in  `onCreate()`, which is the preferred way, or  `onRestoreInstanceState()`.

### Homework: 
- **Build and run an app**
Here is the [Link](https://github.com/BingfanTian96/NEU_CS5520_21Fall/tree/main/lesson2_2_HW) to my code.
	- Overview:
<p float="left">
	<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/2_2_HW_1.png" width="300"/>
	<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/2_2_HW_2.png" width="300"/>
	<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/2_2_HW_3.png" width="500"/>
</p>

- **Question 1**: If you run the homework app before implementing `onSaveInstanceState()`, what happens if you rotate the device? Choose one:
	- The counter is reset to 0, but the contents of the  `EditText`  is preserved.
- **Question 2**: What `Activity` lifecycle methods are called when a device-configuration change (such as rotation) occurs? Choose one:
	-   Android shuts down your  `Activity`  by calling  `onPause()`,  `onStop()`, and  `onDestroy()`, and then starts it over again, calling  `onCreate()`,  `onStart()`, and  `onResume()`.
- **Question 3**: When in the `Activity` lifecycle is `onSaveInstanceState()` called? Choose one:
	-   `onSaveInstanceState()`  is called before the  `onStop()`  method.
- **Question 4**: Which `Activity` lifecycle methods are best to use for saving data before the `Activity` is finished or destroyed? Choose one:
	-   `onPause()`  or  `onStop()`

## Lesson 2_1 Activities and intents
Here is the [Link](https://github.com/BingfanTian96/NEU_CS5520_21Fall/tree/main/lesson2_1) to my code.

### Output:
<p float="left">
    <img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/2_1_1.png" width="300" />
  <img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/2_1_2.png" width="300" /> 
  <img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/2_1_3.png" width="300" /> 
  <img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/2_1_4.png" width="300" /> 
  <img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/2_1_5.png" width="300" /> 
</p>

The main purpose of this lesson is to learn how to implement multiple `Activity` and `Intent`, so that we can send data from one activity to another:

- An  `Activity`  is an app component that provides a single screen focused on a single user task, each `Activity` has its own user interface layout file..
- We can assign `Activity` a parent/child relationship.
- An `Intent` lets you request an action from another component in your app.

### Homework: (optional, will finish in future)
- **Build and run an app**

- **Question 1**: What changes are made when you add a second `Activity` to your app by choosing **File > New > Activity** and an `Activity` template? Choose one:

- **Question 2**: What happens if you remove the `android:parentActivityName` and the `<meta-data>` elements from the second `Activity` declaration in the `AndroidManifest.xml` file? Choose one:

- **Question 3**: Which constructor method do you use to create a new explicit `Intent`? Choose one:

- **Question 4**: In the HelloToast app homework, how do you add the current value of the count to the `Intent`? Choose one:

- **Question 5**: In the HelloToast app homework, how do you display the current count in the second "Hello" `Activity`? Choose one:

## Lesson 1_3 Text and scrolling views
Here is the [Link](https://github.com/BingfanTian96/NEU_CS5520_21Fall/tree/main/lesson1_3) to my code.

### Output:
<p float="left">
	<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/lesson1_3_p1.png" width="300" />
	<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/lesson1_3_p2.png" width="300" /> 
</p>
P1: Top of scrolling views  
P2: Bottom of scrolling views 

The main purpose of this lesson is to learn how to use `ScrollView` to show its child `View` or `ViewGroup`:

- A `ScrollView` can hold only one child `View` or `ViewGroup`.
- We can se a `ViewGroup` such as `LinearLayout` as a child element.
- We can use HTML formatting tags to format the text in a `TextView`.
- Use the  `android:autoLink="web"`  attribute to make web links in the text clickable.

### Homework:
- **Change an app**
	- Overview:
	<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/lesson1_3_p3.png" width="300"/>

- **Question 1**: How many views can you use within a `ScrollView`? Choose one:
	-  One view or one view group
- **Question 2**: Which XML attribute do you use in a `LinearLayout` to show views side by side? Choose one:
	- `android:orientation="horizontal"`
- **Question 3**: Which XML attribute do you use to define the width of the `LinearLayout` inside the scrolling view? Choose one:
	-  `android:layout_width="match_parent"`


## Lesson 1_2_B The layout editor
Here is the [Link](https://github.com/BingfanTian96/NEU_CS5520_21Fall/tree/main/lesson1_2) to my code.

### Output:
<p float="left">
	<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/lesson1_2%20p4.png" />
    	<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/lesson1_2%20p5.png" />
    	<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/lesson1_2%20p6.png" />
    	<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/lesson1_2%20p7.png" width="300" />
  	<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/lesson1_2%20p8.png" width="300" /> 
</p>
P1: Horizontal Layout:<br>
P2: Layout variant for tablets.<br>
P3: Horizontal layout variant for tablets.<br>
P4: LinearLayout.<br>
P5: RelativeLayout.<br>
 
The main purpose of this lesson is to learn how to use layout editor and other two different layout :

- Learn how to create variant of the layout that is different for a horizontal orientation, and to create variant of the layout that is different for a tablet
- There are three different layouts:
	- The `ConstraintLayout`.
	- The `LinearLayout`, this layout is a `ViewGroup` that arranges its collection of views in a horizontal or vertical row.
	- The `RelativeLayout`,  this layout is a `ViewGroup` in which each view is positioned and aligned relative to other views within the group.

### Homework:
- **Change an app**
	- Overview:
		<p float="left">
			<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/HW1.png" width="300"/>
			<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/HW2.png"/>
		</p>
	- Function
		- Click `count` button, then number in textView will increase. `Zero` button will change background  color because it is not Zero now. `Count` button will change background color because the number is odd.
		<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/HW3.png" width="300"/>
		- Click `count` button, then number in textView will increase. `Count` button will change background color because the number is even.
		<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/HW4.png"/>
		- Click `zero` button, then number in textView will become 0. `Count` button will change background color. `Zero` button also change background color.
		<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/HW5.png" width="300"/>
		
- **Question 1**: Which two layout constraint attributes on the **Zero** `Button` position it vertically equal distance between the other two `Button` elements?
	-  `android:layout_marginBottom="8dp"`
	-  `android:layout_marginTop="8dp"`
- **Question 2**: Which layout constraint attribute on the **Zero** `Button` positions it horizontally in alignment with the other two `Button` elements?
	-  `app:layout_constraintLeft_toLeftOf="parent"`
- **Question 3**: What is the correct signature for a method used with the `android:onClick` XML attribute?
	-   `public void callMethod(View view)`
- **Question 4**: You see the statement in the **Logcat** pane if the Log level menu is set to which of the following?
	- Use the  `view`  parameter that is passed to the click handler with `setBackgroundColor()`


## Lesson 1_2_A First Interactive UI
Here is the [Link](https://github.com/BingfanTian96/NEU_CS5520_21Fall/tree/main/lesson1_2) to my code.

### Output:
<p float="left">
  <img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/lesson%201_2%20p1.png" width="300" />
  <img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/lesson%201_2%20p2.png" width="300" /> 
  <img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/lesson%201_2%20p3.png" width="300" />
</p>

P1: Output overview:  
P2: Click `TOAST` button to pop up a toast message.  
P3:Click `COUNT` button to increase the count in the text view.  


The main purpose of this lesson is to understand View, ViewGroup and layouts. :

- All UI elements are subclasses of the `View` class, they are resources that can have an id. The `findViewById` call use the ID of a `View` as its parameter and return the `View`. 
- Learn how to use layout editor to design and edit the activity page. We can edit by `Design` view or `Code` view.
- There are three ways to set `layout_width` and `layout_height`:
	- The `match_constraint`.
	- The `wrap_content`.
	- A fixed number of `dp`.
- We can use `Ectracting string resources` to avoied hardcoded text.
- Learn how to create an `onClick` event.
- Learn hwo to display a toast message.

## Lesson 1_1 Android Studio and Hello World
Here is the [Link](https://github.com/BingfanTian96/NEU_CS5520_21Fall/tree/main/lesson1_1) to my code.

### Output:

<img src="https://raw.githubusercontent.com/BingfanTian96/NEU_CS5520_21Fall/gh-pages/res/Lesson%201_1.png" width="300" />

The main purpose of this lesson is to understand Android Studio and create the first Hello World application:

- Create the first Hello World project and explore the characteristics of Android studio development tools.
- Understand the Gradle Scripts folder, such as build.gradle(Project:) and build.gradle(Module:app).
- Learn how to change the application Gradle configuration.
- Learn how to add log statements to my app.

### Homework:
- **Question 1**: What is the name of the layout file for the main activity?
	- `activity_main.xml`
- **Question 2**: What is the name of the string resource that specifies the application's name?
	- `app_name`
- **Question 3**: Which tool do you use to create a new emulator?
	- `AVD Manager`
- **Question 4**: You see the statement in the **Logcat** pane if the Log level menu is set to which of the following?
	- `Verbose`
	- `Debug`
	- `Info`



