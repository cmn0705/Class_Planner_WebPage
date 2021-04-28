*Tags: Html,Servlet,Tomcat*

**Class Planner**

**App does the following tasks:**
- Let user login with their username and password and save this information on server. When user click on “login” button, a validation check done by javascript to make sure that the username or password entered are not empty. 
- Show a table that includes all the class time frames of a week, so the users can put in their class names into the appropriate fields, making it a schedule
- When user click “save” button, the schedule will be saved in the server, a message will be displayed to tell user that the schedule has been saved
- When user click “download” button, the schedule, in the form “Schedule.csv” file will be downloaded. 
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
![image]()
2. Run tomcat server:
![image]()
3. Open ClassPlanner.html in browser:
![image]()
4. Try to login without entering the username:
![image]()
5. Try to login without entering password:
![image]()
6. Login information validated successfully:
![image]()
7. Login information is saved in “Login.txt” in ClassPlanner/WEB-INF folder: 
![image]()
8. Enter classes into the Schedule fields:
![image]()
9. Click “save” button:
![image]()
10. Schedule is saved in “Schedule.csv” in ClassPlanner/WEB-INF folder:
![image]()
11. Click on “download” button and the file “Schedule.csv” will be downloaded:
![image]()