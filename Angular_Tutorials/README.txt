To generate a new Angular project(this creates a folder with the project inside it):
cd into the folder you want the new folder to be
type:
ng new your-project-name --standalone false

alternatively for newer versions you can type:
ng new yourProjectName

once your project is created you'll want to:
cd intoYourNewProject

make sure Angular is up to date by typing:
ng update @angular/core @angular/cli

and to start your server type:
ng serve (this builds the app, starts the server, watches source files, and rebuilds the apps when source files are updated(hot reload))
http://localhost:4200/

To terminate the server, press CTRL C

To start, enter:
src/app/app.component.html



------------------------------------------
What happens when Angular loads?

When angular loads, it starts at src/index.html
the tag <app-root></app-root> is a custom tag defined in a component, it's a Decorator/annotation.
The selector app-root is what Angular recognizes
It uses content from the templateUrl

------------------------------------------


you can DELETE a project with this line, BEWARE:
rmdir /s /q folderName