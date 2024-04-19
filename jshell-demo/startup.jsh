import java.time.Clock;
import dz.example.jshelldemo.JshellDemoApplication;

var ctx = dz.example.jshelldemo.JshellDemoApplication.bootstrap(new String[] {})

var clock = ctx.getBean(java.time.Clock.class)

var now = clock.instant()
var now2 = java.time.Instant.now()
vat now3 = java.time.Clock.systemUTC().instant()

