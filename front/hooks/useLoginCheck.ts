import { useRouter } from 'next/router';
import React, { useEffect } from 'react';
import { useCookies } from 'react-cookie';

const useLoginCheck = () => {
  const [cookies] = useCookies();
  const router = useRouter();
  return useEffect(() => {
    const { pathname } = router;
    const { accessToken } = cookies;

    if (accessToken) {
      if (pathname === '/login' || pathname === '/login/email' || pathname === 'signup') {
        router.back();
      }
      router.push('/map');
    } else {
      router.push('/login');
    }
  }, [cookies, router.pathname]);
};

export default useLoginCheck;
