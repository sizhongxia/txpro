package com.team.union.util;

/**
 * Created by zhongxia on 6/5/17.
 */
public class PublicUtil {
    public static String getUrlIcon(String url) {
        if (url == null || url.trim().isEmpty() || !isUrl(url)) {
            return "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAADAUlEQVRoge1ZzZXiMAymBErQkxugg8klcm5LB0sHQwdLB8xNSi6hg6UD6AA6mOkg6WD2ECtj8ob8GmYP+d7LAYwVyZY+/bBYzJgxY8aM/wVxBi8kuLdiTlbMiQQLEiy8z/s4g5ef1vMGCQNYwdwp+qkPCZbE5kxsziRYNtYKK5gnDPBjikc5LK1g7il1JcZdnMHq3p44gxUx7kjw6u3bRzksn6l7pYg7cWJzThiioTIShojYnPVG2gwPipjNRl0kZrOZKs+muFUXCyGvFaq8ZfwIeWJxBivL+PFQI+IMVqr8I3w2ymFZGxHanRIGcJRYPtJXXWyVJFgEPSRic7BiPik162BC76COMTaHIAIrnq/YZqocSvEPiflrBV/bTljZKUie0NMfQ5WKmM2mmeis4Ps9IxKGKNgtON+/jt2vOYMES5vitiIDfOtSkASvJFiMfW8lJDVrK+bTprgds/8m4TXip0tBm+J2ctx57gND91alhjmS4PU7bncGlPf2e7F3GPrur5e4YBqzN85gda/yrBOimGObjMnk4SrJQf7vcsbFrzx9N/BLka6brQrECQYMPQHf562YoxV80zonYQDN5n0T4hQPGGxAlMNSlY/ZbFTBOIOVso+u96XkyQY4F7r0VP7iK+9u4RRn8EKp+e0b1/v9gpfJMdB1Ar7yPmPoXr9DG1pphgjiThptS0qUmjUx7ohxN5SKw9Boj0RGgqVl/Gh+73x+bwV+jaksgySyxaL7Gr9b1/J7SoOibjlmb1PBY1uToQ26rt/kgQklSJ9EN1TY6bt1rRxdoH4lsAm+6+ZI4TqzrpK6MWG4TvHboKW0JxS01XtCS1n0KTMGQxmJBC+PaurrfPKo1rWmNsFLyBNyJz8p8HvDM6KY0mYqEoaoLgAfrbyCUrP2BranMbfh2O1UD4KfMPG4QcIAyk6VEtW0oc0YN8l+rX77Rbc/OqV2tHe8nThUN9N4muvHEC4YDFEOy5jNhtgciM1Zx4Q6jnT/FRwoNeunj9NnzJgxY8Y9/AMwP389wO+4ugAAAABJRU5ErkJggg==";
        }
        return "http://" + (url.replaceAll("http://", "").replaceAll("https://", "").split("/")[0]) + "/favicon.ico";
    }

    public static boolean isUrl(String url) {
        if (url == null || url.trim().isEmpty()) {
            return false;
        }
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            return false;
        }
        return true;
    }
}
