
# my-company-common [![CircleCI](https://circleci.com/gh/ivans-innovation-lab/my-company-common.svg?style=svg)](https://circleci.com/gh/ivans-innovation-lab/my-company-common) [![release](http://github-release-version.herokuapp.com/github/ivans-innovation-lab/my-company-common/release.svg?style=flat)](https://github.com/ivans-innovation-lab/my-company-common/releases/latest)

Domain Driven Design is applied through:

1. Command and Query Responsibility Separation (CQRS)
2. Event Sourcing

## Events

Commands are messages with intent of doing something. On the other hand, after this something is done, another messages can be produced as a result - Events. They represent a fact.


This module contains:

- all domain events organized in specific submodules (project, blogPost, ...)
- maven parent pom
- common classes

## Running instructions / Installation

```bash
$ ./mvnw clean install
```



