def testParams() {
  def name = params.INPUT
  sh 'echo hello: ' + name 
  sh 'echo hello from params: ' + params.INPUT
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
              sh 'echo this is stage: ' + params.INPUT
            }
        } 
      }
}
