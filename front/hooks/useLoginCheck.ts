import { useRouter } from 'next/router';
import { useEffect } from 'react';
import { Cookies } from 'react-cookie';

const useLoginCheck = () => {
  const router = useRouter();
  return useEffect(() => {
    const { pathname } = router;
    const cookies = new Cookies();
    const accessToken = cookies.get('accessToken');

    if (accessToken) {
      if (pathname === '/camera') {
        // do nothing
      } else {
        router.push('/map');
      }
    } else {
      if (pathname === '/login' || pathname === '/login/email' || pathname === '/signup' || pathname === '/map') {
        // do nothing
      } else {
        router.push('/login');
      }
    }
  }, [router.pathname]);
};

export default useLoginCheck;
