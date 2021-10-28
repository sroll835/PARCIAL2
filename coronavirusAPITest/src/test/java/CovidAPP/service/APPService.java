package covidAPP.service;

@RestController

public class CovidController{

    public ResponseEntity<?> city(String City){
        try{
            return new ResponseEntity<>(APP.servic.getCity(City), HttpStatus.ACCEPTED);
        } catch (UnirestException e){
            e.printStackTrace();
            return(e.getMessage(), HttpStatus.BAD_REQUEST)
        }
    }
}