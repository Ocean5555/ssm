<span style="color:red;font-size: 48px;">
欢迎你，${user.name}
</span>
<h2>${user.username}</h2>
<h2>${user.age}</h2>
<h2>${user.password}</h2>
<h2>${user.birthday?string('yyyy年MM月dd日 HH时mm分ss秒')}</h2>
<h2>${user.registryTime?string('yyyy年MM月dd日 HH时mm分ss秒')}</h2>
<h2>${user.address!'未登记地址'}</h2>