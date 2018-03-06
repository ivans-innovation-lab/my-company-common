
# [projects](http://ivans-innovation-lab.github.io/projects)/my-company-common [![CircleCI](https://circleci.com/gh/ivans-innovation-lab/my-company-common.svg?style=svg)](https://circleci.com/gh/ivans-innovation-lab/my-company-common) [![release](http://github-release-version.herokuapp.com/github/ivans-innovation-lab/my-company-common/release.svg?style=flat)](https://github.com/ivans-innovation-lab/my-company-common/releases/latest)

Apache Maven is used as a project management and comprehension tool. Maven supports project aggregation in addition to project inheritance. Maven processes projects with multiple modules so you can work with them more effectively. This project holds a maven parent pom.

Domain Driven Design is applied through:

1. Command and Query Responsibility Separation (CQRS)
2. Event Sourcing

## Events

Commands are messages with intent of doing something. On the other hand, after this something is done, another messages can be produced as a result - Events. They represent a fact.


This module contains:

- all domain events organized in specific submodules (project, blogPost, ...)
- maven parent pom
- common classes

## Development

This project is driven using [Maven][mvn].

[mvn]: https://maven.apache.org/

### Run/Install locally

```bash
$ ./mvnw clean install
```

### Run tests

This component comes with tests. Use the following command to execute the tests using Maven:

```bash
$ ./mvnw test
```

---
Created by [Ivan Dugalic][idugalic]@[lab][lab].
Need Help?  [Join our Slack team][slack].

[idugalic]: http://idugalic.pro
[lab]: http://lab.idugalic.pro
[slack]: https://communityinviter.com/apps/idugalic/idugalic
[atomist]: https://www.atomist.com/


