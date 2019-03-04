<ul>
    <#list users as user>
        <li>${user_index}-${user.username}-${user.name}-${user.password}</li>
    </#list>
</ul>