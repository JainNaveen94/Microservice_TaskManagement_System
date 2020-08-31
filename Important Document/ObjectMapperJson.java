@Override
	public List<EmployeeModel> getEmployeeList() {
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<List<EmployeeModel>> typeReference = new TypeReference<List<EmployeeModel>>() {};
		InputStream input = TypeReference.class.getResourceAsStream("/json/employee.json");
		try {
			return mapper.readValue(input, typeReference);
		} catch (IOException exception) {
			throw new DatabaseGatewayNotFoundConnectionException(ErrorMessageConstant.DATABASE_CONNECTION_EXCEPTION);
		}
	}