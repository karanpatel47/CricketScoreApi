# CricketScoreApi
# CricketScoreApi

**CricketScoreApi** is a RESTful API that provides real-time cricket scores and match details. It is built using **Spring Boot** for the backend and delivers fast, reliable data to cricket enthusiasts, developers, and applications.

## Features
- Retrieve live cricket match scores.
- Fetch details of ongoing and completed matches.
- View player statistics and team summaries.
- JSON responses for easy integration with front-end or other services.

## Endpoints
The following API endpoints are available:

### 1. Get Live Match Scores
**Endpoint**: `GET /api/v1/matches/live`

**Description**: Retrieves the scores of all live matches.

**Example Response**:
```json
{
  "matches": [
    {
      "matchId": "12345",
      "teamA": "India",
      "teamB": "Australia",
      "scoreA": "250/6",
      "scoreB": "200/4",
      "status": "India leads by 50 runs"
    }
  ]
}
```

### 2. Get Match Details
**Endpoint**: `GET /api/v1/matches/{matchId}`

**Description**: Fetch detailed information about a specific match.

**Request Example**:
```
GET /api/v1/matches/12345
```

**Example Response**:
```json
{
  "matchId": "12345",
  "teams": {
    "teamA": "India",
    "teamB": "Australia"
  },
  "scores": {
    "teamA": "250/6",
    "teamB": "200/4"
  },
  "summary": "Day 2: India leads by 50 runs",
  "players": [
    {
      "name": "Virat Kohli",
      "score": "85 runs",
      "wickets": 0
    },
    {
      "name": "Pat Cummins",
      "score": "40 runs",
      "wickets": 3
    }
  ]
}
```

### 3. Get Completed Matches
**Endpoint**: `GET /api/v1/matches/completed`

**Description**: Provides a list of recently completed matches.

**Example Response**:
```json
{
  "completedMatches": [
    {
      "matchId": "12344",
      "teams": "England vs New Zealand",
      "result": "England won by 5 wickets"
    }
  ]
}
```

## Technologies Used
- **Java 17**
- **Spring Boot**
- **Maven** (build automation)
- **JSON** for data exchange

## How to Run the Project
Follow these steps to set up and run the project locally:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/karanpatel47/CricketScoreApi.git
   cd CricketScoreApi
   ```

2. **Build the Project**:
   Use Maven to build the project:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:
   Start the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```
   The application will run at `http://localhost:8080` by default.

4. **Test the API**:
   Use tools like Postman or curl to test the endpoints.

   Example:
   ```bash
   curl -X GET http://localhost:8080/api/v1/matches/live
   ```

## Deployment
You can deploy the application on cloud platforms like **Heroku**, **AWS**, or **Azure**. For deployment instructions, refer to the documentation of your respective cloud service.

## Future Enhancements
- Add player rankings and tournament standings.
- Include match schedules.
- Provide websocket support for live updates.

## Contributing
Contributions are welcome! If you find any issues or want to improve the API:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Submit a pull request with detailed information.

## License
This project is licensed under the [MIT License](LICENSE).

## Contact
For any queries or feedback, feel free to contact:
- **Karan Patel**
- Email: [karanpatel47@gmail.com](mailto:karanpatel47@gmail.com)

---

**Enjoy building your cricket apps with CricketScoreApi! 🏏**
