pipeline {
  agent any
  stages {
    stage('Hello') {
      steps {
        echo 'Hello Yacine cv labes'
      }
    }

    stage('mail') {
      steps {
        mail(subject: 'New commit', body: 'Yes', cc: 'hb_chergui@esi.dz')
      }
    }

  }
}