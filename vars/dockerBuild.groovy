 def call(){

    sh """
     docker image build -t ${hubUser}/${project} .
"""
 }
 
  