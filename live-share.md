# how to use live share

Open a new web browser window as incognito/inPrivate (I don't want to mess with your cookies :)

Navigate to

https://github.com/arleth-interview

Sign in with

username: arleth-interview
password: DTCI-interview1

After the interview I'll reset the password :)

Now you can open the private repository -

https://github.com/arleth-interview/sample-maven-project

Read through the README that comes up and while you do that I'll setup the LiveShare Session 

### connecting to the live share session

1) interviewer starts the session
2) shares a link to be pasted into a new tab in the incognito window opened above
3) vs-code will prompt you open or download the tool, click CANCEL, then click on 
    Join the Live Share session from the browser (preview)
4) a prompt (lower right of the window) click "sign in", select "Sign In With GitHub"
5) FINALLY click the green "Authorize VisualStudioLiveShare"

### first time using live share on the web

The project tree is on the left, open

    sample-maven-project->src->main
    sample-maven-project->src->test

1) select Main.java and read through the comments
2) Time to get to work - select PasswordValidator.java

Currently only syntax highlighting and general error reporting is enabled in the web view. If we were to use the desktop version of vs-code, we could both interactively compile and run the project. For your personal project I highly recommend this but for an interview it is usually not a good idea to mess with your github login and IDE ;)

A bash terminal is available in the lower half of the window as read-only. Sorry you can't run code on the interviewers computer. As the interviewer runs or mvn compiles the app you will be able to see errors here.