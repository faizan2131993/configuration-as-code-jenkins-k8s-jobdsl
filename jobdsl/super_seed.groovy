job('super-seed') {
  scm {
    git {
      remote {
        url ('https://github.com/faizan2131993/configuration-as-code-jenkins-k8s-pipeline.git')
      }
    }
  }
  steps {
    dsl {
      external('jobdsl/**/*.groovy')
      removeAction('DELETE')
    }
  }
}
