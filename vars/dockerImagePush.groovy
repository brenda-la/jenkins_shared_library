 def call(String project, String ImageTag, String hubUser){
    withCredentials([usernamePassword(
    credentialsId: 'docker', 
    passwordVariable: 'edenhope1',
    usernameVariable: 'javaapps')]) {

      
         sh "docker login -u '$USER' -p '$PASS'"
     }
     sh "docker image push ${hubUser}/${project}:${ImageTag}"
     sh "docker image push ${hubUser}/${project}:latest"   
}