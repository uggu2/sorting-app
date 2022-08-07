# sorting-app

For this task I am using SpringBoot for backend and Thymeleaf for frontend.
I focused on setting up the design and main bones of the system.
To test the app, 
1. run SortingApplication.java
2. head to localhost:8080
3. select input file and click submit.
4. there is a dropdown of possible algorithms to choose from. (although the implementation is missing)
5. hitting sort should update the empty results table to input data.

My main goal was to create such a system that adding new algorithms would be easy:
1. Create new implementation in algorithm\impl
2. Add new enum in AlgorithmType.java
3. Add a new switch statement in AlgorithmStrategyFactory.java
Unfortunately I needed more time to fully complete the functionality, so here is my list of
TODO:
4. Implement algorithms for sorting in algorithm\impl. For now the methods input HashMap for easier retrieval and output TreeMap to keep track of the sorted data - not sure if this is the best approach.
5. Proper error handling
6. Benchmark indicators for number of records and sorting time
7. Unit tests and integration tests
8. Possibility to save file - add DownloadController in controller package + DownloadService
9. Ui beautify
10. Would be nice to have an InputValidator to check if the data in input file is in expected format.

Thanks to anyone who will review, I appreciate any feedback.
