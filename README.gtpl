<div align="center">
  <br>
    <h3 align="center">Visitors count</h3>
    <p align="center"><img align="center" src="https://count.getloli.com/get/@innerviewer?theme=asoul" /></p> 
  <br>
</div>

<div align="center">
  <h3 align="center">Stats</h3>
</div>

<div align="center">
  <img src="https://github-readme-streak-stats.herokuapp.com/?user=innerviewer&theme=black-ice&hide_border=true&stroke=0000&background=0D1117&ring=0080FF&fire=0080FF&currStreakLabel=0080FF" />
</div>

<div align="center">
  <img width="49%" height="195px" src="https://github-readme-stats-git-masterorgs-github-readme-stats-team.vercel.app/api?username=innerviewer&include_orgs=true&show_icons=true&count_private=true&hide_border=true&title_color=0080FF&icon_color=ffffff&text_color=c9d1d9&bg_color=0d1117" /> 
  <img width="49%" height="195px" src="https://github-readme-stats.vercel.app/api/wakatime?username=innerviewer&layout=compact&hide_border=true&langs_count=6&title_color=0080FF&text_color=ffffff&bg_color=0d1117" />
</div>

### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}
### 🔨 My recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}
### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}