package entry.dsm.gitauth.equusgithubauth.domain.auth.presentation.controller

import entry.dsm.gitauth.equusgithubauth.domain.auth.presentation.dto.GithubUserInformation
import entry.dsm.gitauth.equusgithubauth.domain.auth.service.GithubUserService
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/github/auth")
class GithubAuthenticationController(
    val githubUserService: GithubUserService
) {

    @GetMapping
    fun githubAuth(): String {
        return "redirect:/oauth2/authorization/github"
    }

    // 이 주석 아래 메서드들은 테스트용 메서드 입니다.
    @GetMapping("/authenticated/")
    fun getGithubUserInfo(@AuthenticationPrincipal oAuth2User: OAuth2User): GithubUserInformation {
        return githubUserService.getGithubUserInformation(oAuth2User)
    }

    @GetMapping("/not/authenticated/")
    fun notAuthenticated(): String {
        return "Not authenticated"
    }
}