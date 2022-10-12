pipeline {
  agent any
  stages {
    stage('Mail Notification') {
      steps {
        mail(subject: 'new commit', body: 'Hey sd', cc: 'cherguiyacine54@gmail.com')
      }
    }

  }
}