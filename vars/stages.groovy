def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh "mvn clean package"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       //sh "mvn clean sonar:sonar"
       sh 'echo "analysing the source code and create the report"'
       
     }
  else if ("${stageName}" == "Upload Into Nexus")
     {
       //sh "mvn clean deploy"
       sh 'echo "deploy the artifact into nexus server "'
     }
}
