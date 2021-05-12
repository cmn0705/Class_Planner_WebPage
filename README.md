*Tags: Web Development, Frontend, Backend*

[**Class Planner**](https://cmn0705.github.io/Class_Planner_WebPage/tomcat/webapps/ClassPlanner/WEB-INF/ClassPlanner.html)

**Description:**
- Developed a class planner webpage that lets users login with their information, enter their classes and time into the table fields to make a schedule, save the schedule, and download the schedule in the form of CSV file.
- Wrote JavaScript codes to validate the information entered. 
- Designed server side of the webpage to save user login information and their schedule so that they can be retrieved later.
- Tools used: *html, Servlet, Tomcat*

**Developing techniques: HTML/Javascript/Java servlet tomcat**

1. A main html page called “Class Planner.html” which contain the table of the schedule
2. A “Login.html” page are embedded in the “Class Planner.html” so the user can login with username and password. Login information is validated using JavaScript codes in the Login.html page itself. The ‘login’ button also trigger the “login.class “ to run in the server and save username and password information to a file called “Login.txt”
3. When user done entering their classes to the schedule and click “save”, the “save.class” will be triggered in server to save this schedule to the server in the form of a file called “Schedule.csv”
4. When user click “download” button, it triggers the link to download the “Schedule.csv” file in server.

**Set up**
1. Copy the given “ClassPlanner” folder into tomcat/webapps folder
2. In Terminal, go to tomcat/bin folder, type ‘./startup.sh’ to start the server:
3.	In browser, go to http://localhost:9091/ to make sure the server is running
4. Go to tomcat/webapps/ClassPlanner/WEB-INF to open the “ClassPlanner.html” in a browner to start

**Demonstration**
1. Copy the folder ClassPlanner to tomcat/webapps:
![image](https://cmn0705.github.io/Class_Planner_WebPage/img/image001.png)
2. Run tomcat server:
![image](https://cmn0705.github.io/Class_Planner_WebPage/img/image003.png)
3. Open ClassPlanner.html in browser:
![image](https://cmn0705.github.io/Class_Planner_WebPage/img/image005.png)
4. Try to login without entering the username:
![image](https://cmn0705.github.io/Class_Planner_WebPage/img/image007.png)
5. Try to login without entering password:
![image](https://cmn0705.github.io/Class_Planner_WebPage/img/image009.png)
6. Login information validated successfully:
![image](https://cmn0705.github.io/Class_Planner_WebPage/img/image011.png)
7. Login information is saved in “Login.txt” in ClassPlanner/WEB-INF folder: 
![image](https://cmn0705.github.io/Class_Planner_WebPage/img/image013.png)
8. Enter classes into the Schedule fields:
![image](https://cmn0705.github.io/Class_Planner_WebPage/img/image015.png)
9. Click “save” button:
![image](https://cmn0705.github.io/Class_Planner_WebPage/img/image017.png)
10. Schedule is saved in “Schedule.csv” in ClassPlanner/WEB-INF folder:
![image](https://cmn0705.github.io/Class_Planner_WebPage/img/image019.png)
11. Click on “download” button and the file “Schedule.csv” will be downloaded:
![image](https://cmn0705.github.io/Class_Planner_WebPage/img/image021.png)