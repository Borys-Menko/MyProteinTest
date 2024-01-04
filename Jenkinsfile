def testParams() {
  def name = params.INPUT
  sh 'echo hello'
}

pipeline {

    agent any
  
    parameters {
        string name: 'INPUT', description: 'Build a specific branch.'
    }

    stages {
        stage("test_params") {
            steps {
              testParams()
            }
        } 
      }
}
