This folder will house any potential enterprise/production projects I'm working on

To generate a new Angular project(this creates a folder with the project inside it):
cd into the folder you want the new folder to be
type:
ng new your-project-name --standalone false
or
ng new --no-standalone your-project-name

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

to add bootstrap you may be able to paste this code:
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
