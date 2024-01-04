def testParams() {
  def name = params.INPUT
  sh 'echo $name'
}

pipeline {

    agent any
  
    parameters {
        string name: 'INPUT', description: 'Build a specific branch.'
    }

    stages {
        stage {
            steps {
              testParams()
            }
        } 
      }
}
