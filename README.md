### :sparkles: Playing with JdbcTemplate and DataSource :sparkles:

```
I've implemented different ways of injecting a DataSource into a JdbcTemplate
```

#### Method 1

- Defining a DataSource Bean and fetching values using @ConfigurationProperties in AppConfig.
- Defining a JdbcTemplate Bean and injecting previously created DataSource Bean in AppConfig.
- And using this JdbcTemplate Bean in Repository.

- Refer example1 package for the implementation.

#### Method 2

- Autowiring Environment in a @Configuration Class.
- Creating a DataSource Bean.
- Fetching values using environment variable from properties defined in application.properties file.
- In the Repository, we can Autowire DataSource by specifying the name of the DataSource Bean that is created previously.
- After this, we can Autowire JdbcTemplate and start using it.
- NOTE: DataSource can be Autowired or it can be injected to the JdbcTemplate using Constructor as well.

- Refer example2 package for the implementation.

#### Method 3

- In a Configuration class, we can define variables and map the properties from application.properties file using @ConfigurationProperties.
- Getters and Setters are MUST. Else, it won't work.
- We can create a DataSource Bean and set the values from Getters.
- In the Repository, we can Autowire DataSource by specifying the name of the DataSource Bean that is created previously.
- After this, we can Autowire JdbcTemplate and start using it.
- NOTE: DataSource can be Autowired or it can be injected to the JdbcTemplate using Constructor as well.

- Refer example3 package for the implementation.

##### :tada: Will update here if I come across a better implementation ! :tada: