




public class conectApi implements GetDataApi{
	
	@override
	public String apiCases() {
		HttpResponse<String> message = Unirest.get('https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/total').header('x-rapidapi-host': 'covid-19-coronavirus-statistics.p.rapidapi.com').header('x-rapidapi-key': 'SIGN-UP-FOR-KEY');
		return message.getBody();
	}
	
}