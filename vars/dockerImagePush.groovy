 def call(String project, String ImageTag, String hubUser){
  withCredentials([usernamePassword(credentialsId: 'docker',
   passwordVariable: 'pass',
    usernameVariable: 'User')]) {
    
      sh "docker login -u '$User' -p '$pass'"
     }
     sh "docker image push ${hubUser}/${project}:${ImageTag}"
     sh "docker image push ${hubUser}/${project}:latest"   
}