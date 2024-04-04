Step to create Spring project

Step 1:
    - Create Maven based Architype project

Step 2:
    -
    
Step 3:
	- Configure Front Controller: DispatcherServlet in such a way that it will accept al incoming requests.
	- In order to configure DspatcherServlet,  Spring MVC provides an interface :
		WebAplicationInitializer
		
	- The configuration is done by creating a class which implement this interface
	
Step 4:
	- Create View(JSP)
	in Spring MVC, the view i.e JSP page can reside anywhere  under 'webapp'
	
Step 5:
	- Create a Controller (Simple Java Class)
	-In Spring, it is a simple Java class however it must configured as a Controller specific class
	- this is done by using @Controller annotation applied at a class level
	
	-Once the class is created,it is necessary to define a method which will be responsible for handling that request
	
	-Ideally the method performs some operation or may invoke some Model and return the name of the view.
	-Since the method is handling the request,it must be informed
	
Step 6:
	Configure view resolver
	- Spring MVC provides several view resolvers, the most frequently used is InternalResourceViewResolver
	- It mainly works upon 2 properties 
	 1. prefix
	 2. sufixr 