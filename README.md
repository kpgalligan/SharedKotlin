# KMMBridge With SKIE

This is a template project for Kotlin Multiplatform using KMMBridge to publish Xcode Framework binaries and incorporating SKIE to help streamline the API design for calling from Swift.

You can use the template as a great starting point for including shared Kotlin in your native mobile project.

## [KMMBridge Quick Start Blog Post](https://touchlab.co/kmmbridge-quick-start)

Read more about this repo, what you can use it for, and how to get started.

## [Template Docs](https://touchlab.co/kmmbridgeskie)

Detailed docs about this repo project.


# Hello

```mermaid
sequenceDiagram
    actor Local Android
    participant Android Repo
    participant Kotlin Repo
    participant iOS Repo
    Android Repo->>Local Android: Pull latest
    Local Android->>Local Android: Make changes
    Local Android->>Android Repo: Push latest
    Android Repo->>Android Repo: PR review/merge
    Android Repo->>Kotlin Repo: PR created for updates
    Kotlin Repo->>Kotlin Repo: PR
    create actor Local iOS
    Kotlin Repo->>Local iOS: Pull PR changes
    Local iOS->>Local iOS: Make changes
    Local iOS->>iOS Repo: Push latest
    iOS Repo->>iOS Repo: PR review/merge
    iOS Repo->>Kotlin Repo: Complete PR and merge
```
