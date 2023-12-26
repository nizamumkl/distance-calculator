# distance-calculator

My Approach

Following are the approach I take to accomplish the assignment of creating a web service that calculates the total distance from 2 input distances with specified units:

Understanding the Requirements:
- Read and understand the specifications provided. 
- Identify the key functionalities required: accepting 2 distances with units and returning the total distance in a specified unit.

Selecting Tools and Framework:
- Choose Java as the programming language and Spring Boot as the framework for building the web service. 
- Spring Boot simplifies the process of creating robust and scalable web applications.

Setting Up the Project:
- Create a new Spring Boot project using Maven. 
- Set up the necessary dependencies for Spring Boot.

Designing the Service Endpoints:
- Define the API endpoints that will handle incoming requests. 
- I need a POST endpoint that accepts JSON input containing 2 distances with units.

Creating Request and Response Models:
- Define Java classes to represent the request and response objects. 
- I need classes like DistanceRequest and DistanceResponse to map the incoming JSON payload and the response data structure.

Implementing the Calculation Logic:
- Write the logic in the controller to calculate the total distance based on the provided distances and units. 
- Include conversion logic (ie. converting yards to meters).

Manual Testing the Service:
- Use Postman to send test requests to the service. 
- Ensure that the calculations are accurate and the responses match the expected format.

Handling Edge Cases and Error Scenarios:
- Consider expected scenarios where the input might be invalid or unexpected. 
- Implement error handling and validation to handle such cases gracefully.

Creating Unit Testing & Integration Testing Code
- Unit test will ensure that the calculations are accurate and the responses match the expected format and also handling edge cases and error scenarios.
- Integration test verifies the actual HTTP endpoint by sending requests and checking responses, validating that the controller's behavior aligns with expectations. 

Documentation and Code Cleanup:
- Provide clear documentation for the API endpoints, including input formats and expected responses. 
- Ensure the code is well-organized, readable, and follows best practices.

Deployment and Further Enhancements:
- Deploy the service to a server or platform. 
- Additionally, consider any further improvements or additional features that might enhance the functionality of the web service.
  
