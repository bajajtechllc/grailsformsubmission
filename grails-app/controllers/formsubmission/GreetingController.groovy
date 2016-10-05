package formsubmission

class GreetingController {

    def index() { 
    	def name = params.name
    	if(name == "")
    		name = "World"
    	render "Hello $name!"
    }
}
